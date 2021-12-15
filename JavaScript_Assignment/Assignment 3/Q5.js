var fullName = {
    firstName: "sumana",
    lastName: "sharath",
  };
  
  console.log(
    "Before initializing data the values are " +
      fullName.firstName +
      " " +
      fullName.lastName
  );
  
  fullName.lastName = "sharath";
  console.log(
    "After initializing data the values are " +
      fullName.firstName +
      " " +
      fullName.lastName
  );
  console.log(
    "Accessing the middle name Before assigning " + fullName.middleName
  );
  
  fullName.middleName = "anu";
  console.log("Accessing the middle name After assigning " + fullName.middleName);