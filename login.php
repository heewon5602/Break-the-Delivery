<?php
    if ($_SERVER['REQUEST_METHOD'] == 'POST')
    {
        $userid = $_POST['userid'];
        $password = $_POST['password'];
    
        require_once 'volley_connect.php';
    
        $sql = "SELECT * FROM user_btd WHERE userid = '$userid'";
    
        $response = mysqli_query($conn, $sql);
        if ($response === false) {
            echo "MySQL Error: " . mysqli_error($conn);
        }
    
        $result = array();
        $result['login'] = array();
    
        if (mysqli_num_rows($response) === 1)
        {
            $row = mysqli_fetch_assoc($response);
            if (password_verify($password, $row['password']))
            {
                $index['userid'] = $row['userid'];
                $index['password'] = $row['password'];
                $index['type'] = $row['type'];
    
                array_push($result['login'], $index);
    
                $result['success'] = "1";
                $result['message'] = "success";
                echo json_encode($result);
    
                mysqli_close($conn);
            }
            else
            {
                $result['success'] = "0";
                $result['message'] = "error";
                echo json_encode($result);
    
                mysqli_close($conn);
            }
        }
        else{
            $result['success'] = "0";
                $result['message'] = "error";
                echo json_encode($result);
    
                mysqli_close($conn);
        }
    }
?>