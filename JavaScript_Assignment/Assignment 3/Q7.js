var str = '{"fname" : "sumana", "lname" : "sharath"}';

var obj=JSON.parse(str);

obj.lname="sanu"
alert(obj.fname + " , " + obj.lname);