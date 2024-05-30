[#ftl]
[#import "/spring.ftl" as spring]
<!DOCTYPE html>
<html lang="cs">
<head>
    <meta charset="UTF-8">
    <title>Registration for summer children´s camp</title>
    <link rel="stylesheet" href="/style.css"/>
</head>
<body>
<div class="container">
    <div class="">
        <h1>Registration finished</h1>
        <div>Your children <strong>${form.firstName} </strong> has been registered to our summer camp. <br>
            [#if form.email??]
                Confirmation email was sent to your email address ${form.email}.
            [/#if]
        </div>
    </div>
</div>
</body>
</html>
