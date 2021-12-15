class Rectangle {
    constructor(height, width) {
      this.height = height;
      this.width = width;
    }
  
    get getArea() {
      return this.height * this.width;
    }
  }
  
  const rectangle = new Rectangle(4, 5);
  

  rectangle.hieght = 50;
  
 
  console.log(rectangle.getArea);