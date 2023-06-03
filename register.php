<?php
    if ($_SERVER['REQUEST_METHOD'] == 'POST')
    {
        $userid = $_POST['userid'];
        $password = $_POST['password'];
        $phoneNumber = $_POST['phoneNumber'];
        $type = $_POST['type'];

        $password = password_hash($password, PASSWORD_DEFAULT);

        require_once 'volley_connect.php';

        $sql = "INSERT INTO user_btd(userid, password, phoneNumber, type) VALUES 
        ('$userid', '$password', '$phoneNumber', '$type')";

        if (mysqli_query($conn, $sql))
        {
            $result["success"] = "1";
            $result["message"] = "success";

            echo json_encode($result);
            mysqli_close($conn);
        }
        else
        {
            $result["success"] = "0";
            $result["message"] = "error";

            echo json_encode($result);
            mysqli_close($conn);
        }
    }