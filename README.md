Telecommunications
TRANSMISSION ERROR DETECTION AND CORRECTION PROGRAM

PROGRAM_A - program containing a functional algorithm and test
PROGRAM_B - contains a menu and functional algorithm
---------------------------------------------------------------------------------------------------------------------
Matrix H1 - designed for correcting single transmission errors
Matrix H2 - designed for correcting double transmission errors
Problem Formulation:
The program deals with the implementation of error correction codes for various transmission error scenarios. In particular:

Development of a code correcting single bit errors for eight-bit messages (1 byte).
Development of a code correcting double bit errors for eight-bit messages (1 byte).
METHODS OF CREATING CODES:

The program implements various methods of creating error correction codes, such as:

Repetition method: Involves repeating the message multiple times to increase the distance between codewords.
Algebraic coding: Utilizes additional parity bits for error detection and correction, where these bits are calculated based on the parity check matrix.
TASK:
The main tasks of the program are:

Development of a code correcting single bit errors for eight-bit messages.
Development of a code correcting double bit errors for eight-bit messages.
Writing a program to encode any file into one of the developed codes (preparation for transmission) and decoding it back to its original form (data recovery after transmission) with error correction. The program allows encoding/decoding operations independently, enabling simulation of transmission errors by manually modifying the file.
USER TIPS:

Make sure the file you want to transform is in a format supported by the program.
Utilize the appropriate program options for encoding and decoding data.
Carefully monitor the messages displayed by the program to track the data transformation process.
The "out" folder contains three built-in text files:

start - a txt file that will be encoded and transmitted
mid - a txt file representing start.txt after encoding
end - a txt file after transmission and decoding
The mid.txt file will always have a size exactly twice as large as start.txt/end.txt.
It is possible to modify the program to work for any file. To achieve this, the Main class must be modified accordingly.

Thank you for using the program!
