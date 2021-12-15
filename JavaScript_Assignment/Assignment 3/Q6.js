var str = '({"fname" : "sumana", "lname" : "sharath"})';
var obj = eval(str);
obj.lname = "sanu";
alert(obj.fname + " , " + obj.lname);