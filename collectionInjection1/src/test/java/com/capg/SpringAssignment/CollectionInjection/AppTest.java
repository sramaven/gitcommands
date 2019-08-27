package com.capg.SpringAssignment.CollectionInjection;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.util.Arrays;

import com.capg.SpringAssignment.Question.Question;

public class AppTest 
{
	public Question ques=new Question();
    @Test
    public void testGetAnswers()
    {
    	ques.setAnswers(Arrays.asList("AP","TELANGANA"));
    	assertEquals(Arrays.asList("AP","TELANGANA"),ques.getAnswers());
    }
}
