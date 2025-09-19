```markdown
# 📦 Marvellous Packer Unpacker

[![Made with Java](https://img.shields.io/badge/Made%20with-Java-orange?logo=java&logoColor=white)](https://www.java.com/)
[![Platform](https://img.shields.io/badge/Platform-Linux%20%7C%20Windows-blue?logo=linux&logoColor=white)]()
[![License](https://img.shields.io/badge/License-MIT-green.svg)](LICENSE)
[![GitHub Repo](https://img.shields.io/badge/GitHub-pratik--codeX-lightgrey?logo=github)](https://github.com/pratik-codeX)

A simple Java-based utility to **pack multiple files from a directory into a single packed file**.  
Each file is stored with a fixed-size header (100 bytes) containing metadata such as filename and size, followed by the file’s actual content.

---

## 🚀 Features
- Traverse a directory and read all files.
- Create a single packed file containing:
  - **100-byte header** (filename + size + padding).
  - **Original file content**.
- Displays the number of files successfully packed.
- Console-based interface.

---

## 🛠️ Technologies Used
- **Java** (Core + I/O + File handling)
- **OOP concepts**

---

## 📂 Project Structure
```

MarvellousPackerUnpacker/
│── MarvellousPacker.java   # Handles packing logic
│── program467.java         # Main class (entry point)

````

---

## ▶️ How to Run

1. **Compile the program:**
   ```bash
   javac MarvellousPackerUnpacker/*.java
````

2. **Run the program:**

   ```bash
   java MarvellousPackerUnpacker.program467
   ```

3. **Input required:**

   * Directory path containing files to pack.
   * Name of the output packed file.

---

## 📖 Example Usage

```
Enter the name of Directory that you want to pack :
/home/user/Documents/testfiles

Enter the name of file that you want to create for packing :
output.pack
```

✅ This will create `output.pack` containing all files from the given directory.

---

## 📊 Sample Output

```
--------------------------------------------------------
----------- Marvellous Packer Unpacker -----------------
--------------------------------------------------------
------------------ Packing Activity --------------------
--------------------------------------------------------
/home/user/Documents/testfiles is successfully opened
Packed file gets successfully created with name : output.pack
File name Scanned : file1.txt
File size read is : 120
File name Scanned : file2.txt
File size read is : 98
Packing activity done
--------------------------------------------------------
------------------ Statistical Report ------------------
--------------------------------------------------------
Total files Packed : 2
--------------------------------------------------------
--------- Thank you for using our application ----------
--------------------------------------------------------
```

---

## 📌 Future Enhancements

* Implement **Unpacker** functionality to extract files.
* Add **compression/encryption** support.
* Improve error handling & logs.

---

## 👨‍💻 Author

**Pratik Nanaso Raut**

* GitHub: [@pratik-codeX](https://github.com/pratik-codeX)
* LinkedIn: [Pratik Raut](https://linkedin.com/in/pratik-raut-85248b319)

```

---

👉 You can also create a `LICENSE` file (MIT recommended) so the license badge links properly.  

Do you want me to **generate the MIT `LICENSE` file** for you so you can add it directly to your repo?
```
