<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Book</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body class="bg-light">
    <div class="container mt-5">
        <h2 class="mb-4">Add Book to Library</h2>
        <form action="addBook" method="post">
            <div class="mb-3">
                <label class="form-label">Book Title</label>
                <input type="text" name="title" class="form-control" required>
            </div>
            <div class="mb-3">
                <label class="form-label">Book ID</label>
                <input type="text" name="id" class="form-control" required>
            </div>
             <div class="mb-3">
                <label class="form-label">Book Price</label>
                <input type="number" step="0.01" name="price" class="form-control" required>
            </div>
            <button type="submit" class="btn btn-primary">Add Book</button>
        </form>
    </div>
</body>
</html>