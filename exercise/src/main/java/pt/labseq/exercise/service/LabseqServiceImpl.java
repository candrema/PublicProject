package pt.labseq.exercise.service;

import java.util.ArrayList;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class LabseqServiceImpl implements LabseqService{

	@Override
	@Cacheable("labseqValue")
	public int getLabseqValue(int n) {
		if(n < 0) {
			throw new IllegalArgumentException("value " + n + " is not accepted");
		}
		
		int result = 0;
		ArrayList<Integer> calcs = new ArrayList<>();
		calcs.add(n);
		
		while(calcs.size() > 0) {
			Integer value = calcs.remove(calcs.size() - 1);
			if (value == 1 || value == 3) {
				result ++;
			} else if(value >= 4) { //getLabseqValue(n - 4) + getLabseqValue(n - 3);
				calcs.add(value - 4);
				calcs.add(value - 3);
			}	
		}
		
		return result;
	}
}