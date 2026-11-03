
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>My Student Web App</title>

    <style>
        body {
            font-family: Arial, sans-serif;
            background: #eef2ff;
            text-align: center;
            padding: 50px 15px;
        }

        .container {
            background: white;
            max-width: 400px;
            margin: auto;
            padding: 30px;
            border-radius: 12px;
            box-shadow: 0 4px 12px #cccccc;
        }

        input, button {
            padding: 12px;
            margin: 8px;
            width: 80%;
            box-sizing: border-box;
        }

        button {
            background: #2563eb;
            color: white;
            border: none;
            border-radius: 6px;
            cursor: pointer;
        }

        li {
            margin: 10px;
        }
    </style>
</head>

<body>
    <div class="container">
        <h1>Student Management</h1>
        <p>My first web application</p>

        <input id="studentName"
               type="text"
               placeholder="Enter student name">

        <button onclick="addStudent()">Add Student</button>

        <h3>Student List</h3>
        <ul id="studentList"></ul>
    </div>

    <script>
        function addStudent() {
            const input = document.getElementById("studentName");
            const name = input.value.trim();

            if (name === "") {
                alert("Please enter a student name!");
                return;
            }

            const item = document.createElement("li");
            item.textContent = name;

            document.getElementById("studentList").appendChild(item);
            input.value = "";
        }
    </script>
</body>
</html>
