<html>
    <head>
        <meta charset="UTF-8">
        <title>登录</title>
        <link href="https://cdn.bootcss.com/twitter-bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet">
        <link rel="stylesheet" href="/sell/css/style.css">
    </head>
    <body>
        <div style="margin-top: 100px" class="container">
            <div class="row clearfix">
                <div class="col-md-4 column">
                </div>
                <div class="col-md-4 column">
                    <from role="form" method="get" action="/sell/seller/login">
                        <div class="form-group">
                            <label>用户名</label><input type="text" class="form-control" name="username"/>
                        </div>
                        <div class="form-group">
                            <label>密码</label><input type="password" class="form-control" name="password"/>
                        </div>
                        <button type="submit" class="btn btn-default btn-success">Submit</button>
                    </from>
                </div>
                <div class="col-md-4 column">
                </div>
            </div>
        </div>
    </body>
</html>