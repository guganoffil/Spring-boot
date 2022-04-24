
<html>
<head>
<title>Spring-Boot DB Connection</title>
</head>
<body>
<h1>ADD USER</h1>
<form action="adduser">
<label>id</label>
<input type="text" name="id"><br>
<label>Name</label>
<input type="text" name="name"><br>
<label>City</label>
<input type="text" name="city"><br>
<input type="submit" >
</form>
<h1>DISPLAY USER</H1>
<form action="getuser">
<label>id</label>
<input type="text" name="id"><br>

<input type="submit" >
</form>
<h1>DELETE USER</H1>
<form action="deleteuser">
<label>id</label>
<input type="text" name="id"><br>

<input type="submit" >
</form>
</form>
<h1>UPDATE USER</H1>
<form action="updateuser">
<label>id</label>
<input type="text" name="id"><br>

<input type="submit" >
</form>

</body>
</html>