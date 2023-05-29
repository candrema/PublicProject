package pt.labseq.exercise.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RequestMapping("/labseq")
@Tag(name = "Labseq Sequence", description = "Labseq Sequence API")
public interface LabseqApi {

	@Operation(summary = "Calculate labseq sequence by input integer", description = "Returns the integer result")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Successful operation"),
			@ApiResponse(responseCode = "500", description = "Invalid request")})
			
	@GetMapping("/{n}")
	int getLabseqValue(@PathVariable("n") int n);

}
