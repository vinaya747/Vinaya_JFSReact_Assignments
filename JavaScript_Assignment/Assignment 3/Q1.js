class Rectangle {
    constructor(height, width) {
      this.height = height;
      this.width = width;
    }
  }
  
  var rectangle1 = new Rectangle(5, 10);
  var rectangle2 = new Rectangle(12, 20);

  console.log("Rect1 height:" + rectangle1.height);
  console.log("Rect1 width:" + rectangle1.width);
  
  console.log("Rect2 height:" + rectangle2.height);
  console.log("Rect2 width:" + rectangle2.width);
  


  rect1.width = 8;
  console.log("Updated Rect3 height: " + rect1.height);
  console.log("Updated Rect3 width: " + rect1.width);