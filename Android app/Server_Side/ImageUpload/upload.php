<?php
 
// Path to move uploaded files
 $target_path = dirname(__FILE__).'/uploads/' ;


// $target_path = "C:\\xampp\\htdocs\\ImageUpload\\uploads";
//  C:\xampp\htdocs\ImageUpload\uploads

if (isset($_FILES['image']['name'])) {

    $target_path = $target_path . basename($_FILES['image']['name']);
	//echo $target_path
    try {
        // Throws exception incase file is not being moved
        if (!move_uploaded_file($_FILES['image']['tmp_name'], $target_path)) {
            // make error flag true
            echo json_encode(array('status'=>'fail', 'message'=>'could not move file'));
        }
 
        // File successfully uploaded
        //echo json_encode(array('status'=>'success', 'message'=>'File Uploaded'));
		
		ini_set('max_execution_time', 300); 
        // // $python = "C:\\Users\\krishna\\AppData\\Local\\Programs\\Python\\Python35\\python.exe";
        $python = "F:\\Software\\python.exe"; // 
        // // $file = "C:\\xampp\\htdocs\\ImageUpload\\python\\test.py";
        $file = "C:\\xampp\\htdocs\\Plant_Disease\\Learned_weights_Potato\\testing.py";
        // $file = "C:\\xampp\\htdocs\\ImageUpload\\Python\\test.py";

		$output=exec($python . " " . $file);
		echo json_encode(array('status'=>'success', 'message'=>$output));
		
    } catch (Exception $e) {
        // Exception occurred. Make error flag true
        echo json_encode(array('status'=>'fail', 'message'=>$e->getMessage()));
    }
} else {
    // File parameter is missing
    echo json_encode(array('status'=>'fail', 'message'=>'Not received any file'));
}

?>