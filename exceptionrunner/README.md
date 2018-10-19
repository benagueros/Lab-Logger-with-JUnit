Tasks to answer in your own README.md that you submit on Canvas:

1.  See logger.log, why is it different from the log to console?
			
			When a log is made with the level INFO, it is printed to the console. The finer level does not print to the console. This is why the Logger.log file contains information that isn't in the console.
			
			
1.  Where does this line come from? FINER org.junit.jupiter.engine.execution.ConditionEvaluator logResult Evaluation of condition [org.junit.jupiter.engine.extension.DisabledCondition] resulted in: ConditionEvaluationResult [enabled = true, reason = '@Disabled is not present']

			This line comes from the TimerException thrown from timeMe method and TimefailOverTest

1.  What does Assertions.assertThrows do?

			Asserts the executable for the given exception and returns the exception

1.  See TimerException and there are 3 questions
    1.  What is serialVersionUID and why do we need it? (please read on Internet)
	
			Each serializable class gets a version number which is what the serializableVersionUID is. 
			It is used during deserialization to verify that the sender and receiver of a serialized object have loaded classes for that object that are compatible with respects to serialization.
			We declare it so that an unexpected InvalidClassException isn't thrown.
	
    2.  Why do we need to override constructors?
	
			Subclasses inherit fields from their superclass and usually have additional fields of their own which means both sets of fields need to be initialized.
			Overriding the constructor lets us set the fields to something ither than defaults. In this example it gives it the appropriate message;
	
    3.  Why we did not override other Exception methods?	
	
			
	
	
1.  The Timer.java has a static block static {}, what does it do? (determine when called by debugger)
1.  What is README.md file format how is it related to bitbucket? (https://confluence.atlassian.com/bitbucketserver/markdown-syntax-guide-776639995.html)
1.  Why is the test failing? what do we need to change in Timer? (fix that all tests pass and describe the issue)
1.  What is the actual issue here, what is the sequence of Exceptions and handlers (debug)
1.  Make a printScreen of your eclipse JUnit5 plugin run (JUnit window at the bottom panel) 
1.  Make a printScreen of your eclipse Maven test run, with console
1.  What category of Exceptions is TimerException and what is NullPointerException
1.  Push the updated/fixed source code to your own repository.