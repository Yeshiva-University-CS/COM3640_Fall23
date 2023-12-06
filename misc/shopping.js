const shoppingCart = [
  { product: "Apples", price: 5, quantity: 2, discount: 0.10 }, 
  { product: "Bananas", price: 10, quantity: 4, discount: 0.15 }, 
  { product: "Cherries", price: 20, quantity: 8, discount: 0 }, 
];

let fullTotal = 0;
let memberTotal = 0;

// Calculate full total and member total
for (let i = 0; i < shoppingCart.length; i++) {
    const item = shoppingCart[i];
    const itemTotal = item.price * item.quantity;
    fullTotal += itemTotal;
    memberTotal += itemTotal * (1 - item.discount);
}

console.log("Full Total:", fullTotal);      
console.log("Member Total:", memberTotal);
