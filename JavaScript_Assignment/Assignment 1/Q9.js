var a1=["a","b","c"];
  var a2=[1,2,3];

  function array()
  {
      var a=[];
      for(var i=0;i<a1.length;i++)
      {
          a.push(a1[i]);
          a.push(a2[i]);
      }
      return a;
  }
  res=array();
  document.write(res);