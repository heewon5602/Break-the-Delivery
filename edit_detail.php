<?php
    if ($_SERVER['REQUEST_METHOD'] == 'POST')
    {
        $name = $_POST['name'];
        $email = $_POST['email'];
        $id = $_POST['id'];
    
        require_once 'volley_connect.php';
    
        $sql = "UPDATE users_table SET name = '$name', email = '$email' WHERE id = '$id'";
    
        if (mysqli_query($conn, $sql))
        {
            $result['success'] = "1";
            $result['message'] = "사용자 정보 수정 완료";
    
            echo json_encode($result);
            mysqli_close($conn);
        }
    }
    else
    {
        $result['success'] = "0";
        $result['message'] = "사용자 정보 수정 실패";
        echo json_encode($result);
    
        mysqli_close($conn);
    }
?>