import { useState } from "react";
import axios from "axios";
import {useNavigate} from "react-router-dom";

const Login = () => {
    const [username, setusername] = useState("");
    const [password, setpassword] = useState("");
    const
        [errorMessage, setErrorMessage]
            = useState(null); // State for error messages
    const navigate
        = useNavigate();
    const onSubmit = async (event) => {
        event.preventDefault();

        if (!username || !password) {
            setErrorMessage("Vui lòng điền đầy đủ các trường thông tin!");
            return; // Prevent unnecessary API call if fields are empty
        }

        try {
            const response = await axios.post("http://localhost:8080/home/login", {
                username,
                password,
            });

            // Handle successful login (replace with your app's logic)
            console.log("Login successful!", response.data); // Example: log response
            setusername(""); // Clear input fields (optional)
            setpassword("");
            setErrorMessage("Đăng nhập thành công!");
            navigate("/home");
            // Redirect to a protected page or show success message
        } catch (error) {
            // Handle login errors (replace placeholders with specific error messages)
            console.error("Login failed:", error.response.data); // Example: log error
            setErrorMessage(
                error.response?.data?.message || "Đăng nhập thất bại. Vui lòng kiểm tra thông tin của bạn."
            );
        }
    };

    return (
        <div className="container">
            <h1 className="toan">Đăng nhập</h1>
            <form onSubmit={onSubmit}>
                <div className="form-group">
                    <label htmlFor="name">Tên đăng nhập</label>
                    <input
                        type="text"
                        className="form-control"
                        id="name"
                        placeholder="Nhập tên"
                        value={username}
                        onChange={(event) => setusername(event.target.value)}
                    />
                </div>
                <div className="form-group">
                    <label htmlFor="phone_number">Nhập email</label>
                    <input
                        type="password" // Use type="password" for security
                        className="form-control"
                        placeholder="Nhập email"
                        value={password}
                        onChange={(event) => setpassword(event.target.value)}
                    />
                </div>
                {errorMessage && (
                    <div className="alert alert-danger" role="alert">
                        {errorMessage}
                    </div>
                )}
                <button type="submit" className="btn btn-primary">Đăng
                    Nhập</button>
            </form>
        </div>
    );
};

export default Login;