package pt.labseq.exercise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import pt.labseq.exercise.service.LabseqService;

@RestController
public class LabseqApiController implements LabseqApi {
	
	private final LabseqService labseqService;
	
	@Autowired
	public LabseqApiController(LabseqService labseqService) {
		this.labseqService = labseqService;
	}
	
	@Override
	public int getLabseqValue(@PathVariable("n") int n) {
		return labseqService.getLabseqValue(n);
	}

}
