Ex2_1
This program contains three methods for counting the number of lines in an array of text files.

createTextFiles(int n, int seed, int bound)
This method creates a specified number of text files with random content.

Parameters

n: the number of files to create
seed: the seed for the random number generator
bound: the upper bound for the random numbers generated by the random number generator
Returns

an array of strings containing the names of the created files
Throws

FileNotFoundException: if the file cannot be created
UnsupportedEncodingException: if the encoding is not supported
getNumOfLines(String[] fileNames)
This method returns the number of lines in the specified array of files.

Parameters

fileNames: an array of file names
Returns

the number of lines in the files
getNumOfLinesThreads(String[] fileNames)
This method returns the number of lines in the specified array of files using separate threads for each file.

Parameters

fileNames: an array of file names
Returns

the number of lines in the files
Throws

InterruptedException: if any thread has interrupted the current thread
getNumOfLinesThreadPool(String[] fileNames)
This method returns the number of lines in the specified array of files using a thread pool.

Parameters

fileNames: an array of file names
Returns

the number of lines in the files
Throws

ExecutionException: if the computation threw an exception
InterruptedException: if the current thread was interrupted while waiting
callCountLines
This is a Callable task that counts the number of lines in a file. It is used by the getNumOfLinesThreadPool method.
