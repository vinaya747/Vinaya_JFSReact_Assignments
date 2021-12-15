var content=document.getElementsById("content");
var button=document.getElementsById("button");
button.onclick=function()
{
    if(content.className=="open")
    {
content.className="";
    }
    else{
        content.className="open";
    }
}
