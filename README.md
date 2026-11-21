# File Manager

A simple Java console application for managing a text file from a menu: create, write, read and delete.

## Features

- **Create** a new file (reports if it already exists)
- **Write** text to a file (appends to the end of the file)
- **Read** and print the contents of a file line by line
- **Delete** a file
- Simple numbered menu that repeats until you choose Exit

## Requirements

- Java JDK 8 or newer (tested with JDK 21)

## Project Structure

```
.
├── Main.java          # Console menu and user input
├── FileManager.java   # File operations (create, write, read, delete)
├── .gitignore
└── README.md
```

## How to Run

Compile both files and run `Main`:

```bash
javac Main.java FileManager.java
java Main
```

## Usage

1. When the program starts, enter the file name to work with (for example `text.txt`). This name is used for all operations until you exit.
2. Choose an option from the menu:

```
-------Options------
1 : Create File
2 : Write File
3 : Read File
4 : Delete File
5 : Exit
```

| Option | Description |
|--------|-------------|
| 1 | Creates an empty file with the given name. If it already exists, a message is shown. |
| 2 | Asks for a line of text and appends it to the file. |
| 3 | Prints the file contents to the console. |
| 4 | Deletes the file. |
| 5 | Exits the program. |

### Example session

```
Please enter the filename [text.txt] :
text.txt
-------Options------
1 : Create File
...
Select options by entering the number [1-5] :
1
File created : text.txt
```

## How It Works

- `Main` reads user input with `Scanner` and calls the matching method of `FileManager` inside a `switch` statement.
- `FileManager` uses `File`, `FileWriter` and `Scanner` from the Java standard library and handles `IOException` / `FileNotFoundException` by printing an error message.

## Notes and Limitations

- Text is appended, not overwritten, and no newline is added automatically after each write.
- Entering a non-numeric value in the menu will cause the program to crash.
- Reading or writing a file that does not exist prints an error message (writing creates the file automatically).

## Author
[fatemehsdev](https://github.com/fatemehsdev)