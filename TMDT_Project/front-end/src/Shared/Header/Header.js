import { Link } from 'react-router-dom';
import './Header.css'
import logo from './Logo.png'
function Header() {
    return (
        <header>
            <div className="header-left">
                <Link to=""><img className="logo" src={logo} alt="Your Logo" /></Link>
                <Link to="/home">Trang chủ</Link>
            </div>
            <div className="header-center">
                <Link to="/Lmht">Liên minh huyền thoại</Link>
                <Link to="/Genshin">Ghenshin</Link>
                <Link to="/Freefire">Freefire</Link>
            </div>
            <div className="header-right">
                <Link to="/Register">Đăng kí</Link>
                <Link to="/Login">Đăng nhập</Link>
            </div>
        </header>
    );
}

export default Header;