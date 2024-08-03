import './Sidebar.css';
import React, { useState } from 'react';

function Sidebar() {
    const [isChecked1, setIsChecked1] = useState(false);
    const [isChecked2, setIsChecked2] = useState(false); // New checkbox state

    const handleCheckboxChange1 = (event) => {
        setIsChecked1(event.target.checked);
    };

    const handleCheckboxChange2 = (event) => {
        setIsChecked2(event.target.checked);
    };

    return (
        <div className="sidebar-container">
            <div>
                <div
                    className="sidebar">
                    <h1 className="title">Bộ lọc tìm kiếm</h1>
                    <h2 className="title_01">Theo danh mục</h2>
                    <label className="checkbox">
                        <input
                            type="checkbox"
                            checked={isChecked1}
                            onChange={handleCheckboxChange1}
                        />
                        Liên minh huyền thoại
                    </label>
                    <br /> {/* Add a line break to visually separate checkboxes */}
                    <label className="checkbox">
                        <input
                            type="checkbox"
                            checked={isChecked2}
                            onChange={handleCheckboxChange2}
                        />
                        Freefire
                    </label>
                    <h2 className="title_01">Chọn mức giá</h2>
                </div>
            </div>

        </div>

    );
}

export default Sidebar;