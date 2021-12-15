var fullName = {
    firstName: "sushma",
    lastName: "suresh",
  };
  
  console.log(
    "Before initializing data the values are " +
      fullName.firstName +
      " " +
      fullName.lastName
  );
  
  fullName.lastName = "suresh";
  console.log(
    "After initializing data the values are " +
      fullName.firstName +
      " " +
      fullName.lastName
  );