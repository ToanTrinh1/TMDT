import './Register.css'
import {useState} from "react";
import axios from "axios";
const Register = () => {
    const [fullname, setfullname] = useState("");
    const [email, setemail] = useState("");
    const [phone, setphone] = useState("");
    const [addres, setaddres] = useState("");
    const [username, setusername] = useState("");
    const [password, setpassword] = useState("");
    const [isRegistrationSuccessful, setIsRegistrationSuccessful] = useState(false);

    const onSubmit = async (event) => {
        event.preventDefault();

        const data = {
            fullname,
            email,
            phone,
            addres,
            username,
            password,
        };
        if (
            fullname === "" ||
            email === "" ||
            phone === "" ||
            addres === "" ||
            username === "" ||
            password === ""
        ) {
            alert("Vui lòng điền đầy đủ các trường thông tin!");
            return;
        }

        try {
            const response = await axios.post('http://localhost:8080/home/Register', data);
            if (response.status === 200) {
                setIsRegistrationSuccessful(true);
                setfullname('');
                setemail('');
                setphone('');
                setaddres('');
                setusername('');
                setpassword('');
            } else {
                console.error('Đăng ký thất bại:', response.statusText);
                alert('Đăng ký thất bại. Vui lòng thử lại.');
            }
        } catch (error) {
            console.error('Đăng ký thất bại:', error);
            alert('Đăng ký thất bại do lỗi hệ thống. Vui lòng thử lại sau.');
        }
    };
    return (
        <div className="container">
            <h1 className="toan">Đăng kí tài khoản</h1>
            <form onSubmit={onSubmit}>
                <div className="form-group">
                    <label htmlFor="name">Họ và tên</label>
                    <input
                        type="text"
                        className="form-control"
                        id="name"
                        placeholder="Nhập tên"
                        value={fullname}
                        onChange={(event) => setfullname(event.target.value)}
                    />
                </div>
                <div className="form-group">
                    <label htmlFor="phone_number">Nhập email</label>
                    <input
                        type="text"
                        className="form-control"
                        placeholder="Nhập email"
                        value={email}
                        onChange={(event) => setemail(event.target.value)}
                    />
                </div>
                <div className="form-group">
                    <label htmlFor="phone_number">Số điện thoại</label>
                    <input
                        type="text"
                        className="form-control"
                        id="phoneNumber"
                        placeholder="Nhập số điện thoại"
                        value={phone}
                        onChange={(event) => setphone(event.target.value)}
                    />
                </div>
                <div className="form-group">
                    <label htmlFor="phone_number">Địa chỉ</label>
                    <input
                        type="text"
                        className="form-control"
                        id="phoneNumber"
                        placeholder="Nhập địa chỉ"
                        value={addres}
                        onChange={(event) => setaddres(event.target.value)}
                    />
                </div>
                <div className="form-group">
                    <label htmlFor="phone_number">Tên đăng nhập</label>
                    <input
                        type="text"
                        className="form-control"
                        id="phoneNumber"
                        placeholder="Nhập tên đăng nhập  "
                        value={username}
                        onChange={(event) => setusername(event.target.value)}
                    />
                </div>
                <div className="form-group">
                    <label htmlFor="phone_number">Mật khẩu</label>
                    <input
                        type="text"
                        className="form-control"
                        id="phoneNumber"
                        placeholder="Nhập mật khẩu"
                        value={password}
                        onChange={(event) => setpassword(event.target.value)}
                    />
                </div>
                <button type="submit" className="btn btn-primary">Đăng kí</button>
            </form>
            {isRegistrationSuccessful && (
                <div className="alert alert-success">
                    Đăng ký thành công!
                </div>
            )}
        </div>
    );
};

export default Register;