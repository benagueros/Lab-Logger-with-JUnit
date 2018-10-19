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
	
			We need to override the constructors because once we override one, we no longer have the default. 
			Therefore, we have to override the default and any other desired constructor.
	
    3.  Why we did not override other Exception methods?	
			
			The super class handles the other methods, we don't need a specified version of these methods.
			Therefore, we can let the super class functionality work in the subclass.
			
	
	
1.  The Timer.java has a static block static {}, what does it do? (determine when called by debugger)

		This static block takes the logger properties of the static logger of the Timer class and passes it as a stream to the global LogManager.
		This means the log level definitions of the logger are applied to the global LogManager. It gets called the first time the Timer class is used.
		The first time its used is in the failOverTestEdge method of the teaser.


1.  What is README.md file format how is it related to bitbucket? (https://confluence.atlassian.com/bitbucketserver/markdown-syntax-guide-776639995.html)

		The .md file format means it can contain Markdown and a restricted set of HTML tags. 
		Also, Bitbucket's Server will display the contents on the source page of the repository automatically.


1.  Why is the test failing? what do we need to change in Timer? (fix that all tests pass and describe the issue)

		The test was failing due to the NullPointerException from timeNow. 
		When the time to wait is less than 0 it throws the TimerException but in the finally block it uses this variable which is still null.
		There are many ways to fix the issue but I assume the Logger needs to be told there was a problem.
		My fix was to add a conditional statement that check to see if timeToWait is less than 0 and log the proper information.
		

1.  What is the actual issue here, what is the sequence of Exceptions and handlers (debug)

		As stated in the previous answer, the TimerException and even InterruptedException are handled but a NullPointerException is not handled.
		

1.  Make a printScreen of your eclipse JUnit5 plugin run (JUnit window at the bottom panel) 

		

1.  Make a printScreen of your eclipse Maven test run, with console



1.  What category of Exceptions is TimerException and what is NullPointerException

		A TimerException extends Exception which makes it a checked exception. 
		A NullPointerException extends RuntimeException which makes it an unchecked exception.


1.  Push the updated/fixed source code to your own repository.

		