Feature: Order product
 
 Scenario: User details
  Given Click on home button
  When Click on product image
  And Click on add to cart button
  And Click on view cart
  Then Verify product title is correct or not
  Then Verify product price
  Then Verify Quantity
  Then Click on proceed to checkout
  
 Given Fill new user details
