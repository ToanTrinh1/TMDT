import './Homepage.css'
import Sidebar from "../../Shared/Sidebar/Sidebar";
import React from "react";
import Rightbox from "./Rightbox";

function Homepage() {
    return (
        <div className="homepage">
            <div className="running-text" >
                Chào mừng bạn đến với bình nguyên vô tận
            </div>
            <div className="Homepage_container">
                <Sidebar />
                <div className="right-box">
                    <Rightbox/>
                </div>
            </div>
        </div>
    );
}

export default Homepage;