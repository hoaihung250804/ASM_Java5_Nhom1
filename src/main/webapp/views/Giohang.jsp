<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Giỏ hàng</title>
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
</head>
<body style="background-color: #fff4f4;">

  <nav class="navbar navbar-expand-lg navbar-light" style="background-color: #f7fffe;">
    <div class="container">
      <a class="navbar-brand" href="#"><img style="max-height: 60px;" src="../views/image/logo1.webp" alt="Logo"></a>
      <h2 class="mt-3" style="color:#FE5621;">Shoppe | Giỏ Hàng</h2>
      <div class="ms-auto input-group mt-2" style="max-width:500px;">
        <input type="text" class="form-control" placeholder="Tìm Kiếm" aria-label="Search" aria-describedby="basic-addon1" style="border: 2px solid #FE5621;">
        <span class="input-group-text" id="basic-addon1" style="background-color: #FE5621; border: 2px solid #FE5621;min-width:100px;">
          <i class="fas fa-search"></i>
        </span>
      </div>
    </div>
  </nav>

  <div class="container mt-2">
    <div style="background-color: rgb(255, 254, 251); border: 2px solid #ccc; margin-bottom: 10px;">
      <div class="input-group d-flex mt-3">
        <div style="margin-left: 20px; margin-right: 10px;">
          <img src="../views/image/free-shipping.png" alt="Free Shipping">
        </div>
        <p>Nhấn vào mục Mã giảm giá ở cuối trang để hưởng miễn phí vận chuyển bạn nhé!</p>
      </div>
    </div>
    
    <div class="PreviewSP" style="background-color: #f7fffe; margin-bottom: 20px;">
      <div class="row">
        <div class="col-6">
          <div class="input-group d-flex mt-3">
            <div style="margin-right: 10px; margin-left: 20px;"><input type="checkbox"></div>
            <p>Sản phẩm</p>
          </div>
        </div>
        <div class="col-2 mt-3" style="margin-right: 20px;">Đơn giá</div>
        <div class="col-2 mt-3" style="margin-right: 20px;">Số lượng</div>
        <div class="col-1 mt-3" style="margin-right: 20px;">Số tiền</div>
      </div>
    </div>
    
    <div class="mt-3 viewgiohang" style="background-color: #f7fffe; margin-bottom: 20px;">
      <div class="row d-flex" style="padding-top: 30px;padding-bottom:30px;">
        <div class="col-1 align-content-center">
          <div style="margin-right: 10px; margin-left: 20px;"><input type="checkbox"></div>
        </div>
        <div class="col-5">
          <div class="input-group">
            <div class="imgsp">
              <img src="https://down-vn.img.susercontent.com/file/b8897816889397d632db6afb5880bfe6" alt="Product Image" style="max-height: 100px;">
            </div>
            <div class="namesp" style="max-width: 250px; margin-left: 10px; word-spacing: 1px;">
              Áo varsity jacket M.L.B NY dạ dày dặn phối tay da, Áo bomber dạ form rộng nam nữ
              <br>
              <img style="max-height: 20px;" src="https://down-vn.img.susercontent.com/file/vn-50009109-ba88f07bae3c0e2ba3770387843e3c5e" alt="Product Logo">
            </div>
          </div>
        </div>
        <div class="col-2">₫500000</div>
        <div class="col-2" style="margin-right: 20px; margin-left: 20px;"><input type="number" style="width: 150px;" min="1"></div>
        <div class="col-1">₫500000</div>
      </div>
    </div>
    
 <div class="container fixed-bottom" style="background-color: #f7fffe; padding-top: 50px; padding-bottom: 30px;">
  <div class="d-flex justify-content-end align-items-center">
    <p class="mb-0 me-4">Tổng Thanh Toán :</p>
    <p class="mb-0" style="color: #FE5621; margin-right: 40px;">đ 0</p>
    <button class="btn btn-primary me-4" style="background-color: #FE5621; border: 1px solid #FE5621; color: #f7fffe; min-width: 200px; padding: 3px;">Mua hàng</button>
  </div>
</div>
  
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>