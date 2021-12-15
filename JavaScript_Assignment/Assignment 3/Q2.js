class Rectangle {
    constructor(height, width) {
      this.height = height;
      this.width = width;
    }
  
   
    get getArea() {
      return this.height * this.width;
    }
  }
  
  var rectangle = new Rectangle(10, 15);
  

  console.log(rectangle.getArea);