const products = '[{"id": "530","name": "Bamboo","image_title": "ski-coat_lynda_29940","image": "https://hplussport.com/wp-content-lynda.jpg"},{"id": "436","name": "Bluberry","image_title": "mineral-water-bluberry","image": "https://hplussport.com/wp-content-mineral.jpg"}]';
const item = '{"id": "530","name": "Bamboo","image_title": "ski-coat_lynda_29940","image": "https://hplussport.com/wp-content-lynda.jpg"}';

const productsParsed = JSON.parse(products);
const itemParsed = JSON.parse(item);

let cart = [
    {
      productId: "530",
      itemKey: "34354b059d38a963ba3a1bed499f593d",
      itemName: "Bamboo Thermal Ski Coat",
      variations: {
        sizeWomens: "medium",
        color: "periwinkle",
        price: 99.00,
      }
    },
    {
      productId: "532",
      itemKey: "a14cab08bca65354fd65dc6482a55ff5",
      itemName: "Slicker Jacket",
      variations: {
        sizeMens: "large",
        color: "lemon",
        price: 125.00,
      }
    }
];
let single = {
    productId: "530",
    itemKey: "34354b059d38a963ba3a1bed499f593d",
    itemName: "Bamboo Thermal Ski Coat",
    variations: {
      sizeWomens: "medium",
      color: "periwinkle",
      price: 99.00,
    }
};

const cartJson = JSON.stringify(cart);
const singleJson = JSON.stringify(single);