package pt.labseq.exercise.service;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class LabseqServiceTest {
	
	private LabseqService labseqService;
	
	@BeforeAll
	public void init() {
		labseqService = new LabseqServiceImpl();
	}
	
	@Test
	public void testGetLabseqValue() {
		assertTrue(labseqService.getLabseqValue(0) == 0);
		assertTrue(labseqService.getLabseqValue(1) == 1);
		assertTrue(labseqService.getLabseqValue(2) == 0);
		assertTrue(labseqService.getLabseqValue(3) == 1);
		assertTrue(labseqService.getLabseqValue(4) == 1);
		assertTrue(labseqService.getLabseqValue(5) == 1);
		assertTrue(labseqService.getLabseqValue(6) == 1);
		assertTrue(labseqService.getLabseqValue(7) == 2);
		assertTrue(labseqService.getLabseqValue(8) == 2);
		assertTrue(labseqService.getLabseqValue(9) == 2);
		assertTrue(labseqService.getLabseqValue(10) == 3);
	}

}
