import React from 'react';
import './Rightbox.css'
// Mảng dữ liệu chứa thông tin các sản phẩm
const products = [
    {
        name: 'Sản phẩm A',
        price: 100000,
        image: 'path/to/image1.jpg'
    },
    {
        name: 'Sản phẩm B',
        price: 200000,
        image: 'path/to/image2.jpg'
    },
    {
        name: 'Sản phẩm B',
        price: 200000,
        image: 'path/to/image2.jpg'
    },
    {
        name: 'Sản phẩm B',
        price: 200000,
        image: 'path/to/image2.jpg'
    },
    // Thêm các sản phẩm khác vào đây
];

function ProductItem({ name, price, image }) {
    return (
        <div className="product">
            <img src={image} alt={name} />
            <h2>{name}</h2>
            <p>Giá: {price} VND</p>
        </div>
    );
}

function Rightbox() {
    return (
        <div className="product-list">
            {products.map((product) => (
                <ProductItem key={product.name} {...product} />
            ))}
        </div>
    );
}

export default Rightbox;