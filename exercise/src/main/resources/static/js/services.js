let labseqForm = document.getElementById("labseqForm");

labseqForm.addEventListener("submit", (e) => {
  e.preventDefault();

  let labseqInput = document.getElementById("labseqInput");
  
  send(labseqInput.value);
});


const urlBase = "http://localhost:8080/labseq";


let send = function (input) {
	var xmlhttp = new XMLHttpRequest();
    xmlhttp.onreadystatechange = function() {
		if (this.readyState == 4 && this.status == 200) {
			document.getElementById("result").innerHTML =  xmlhttp.responseText;
		} else if (this.status == 500) {
			document.getElementById("result").innerHTML =  "Input invalid";
		}
	}
	
    xmlhttp.open("GET", urlBase + "/" + input, false);
	xmlhttp.setRequestHeader('Accept', '*/*');
    xmlhttp.send();
}