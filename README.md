# CalcScore App

This is a simple Java application that calculates the final score based on certain weighted components (Tubes, Quiz, Tugas, UTS, UAS).

## How to Use

1. **Compile and Run**  
   Compile and run the `CalcScore.java` file to start the application. You can do this using any Java IDE or by using the command line:

   ```bash
   javac CalcScore.java
   java CalcScore
   ```

2. **Input Fields**  
   - Fill in the provided fields with the relevant information.
     - `Nama`: Enter your name.
     - `NIM`: Enter your student ID.
     - `Tubes`, `Quiz`, `Tugas`, `UTS`, `UAS`: Enter the corresponding scores.

3. **Hitung (Calculate)**  
   - Click the "Hitung" button to calculate the final score.
   
4. **View Result**  
   - The application will display the calculated final score along with your name and student ID.

## Score Weights

- `Tubes`: 30%
- `Quiz`: 10%
- `Tugas`: 10%
- `UTS`: 25%
- `UAS`: 25%

## How it Works

The application takes input values for each component and applies the specified weights to calculate the final score. It then displays the result along with the provided name and student ID.

## Dependencies

This application uses Java's Swing library for the GUI.
