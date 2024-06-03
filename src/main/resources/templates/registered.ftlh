[#ftl]
[#import "/spring.ftl" as spring]
<!DOCTYPE html>
<html lang="cs">
<head>
    <meta charset="UTF-8">
    <title>Registration recapitulation</title>
    <link rel="stylesheet" href="/style.css"/>
</head>
<body>
<div class="container">
    <div class="">
        <h1>Thank you! Now your summer camp registration is finished!</h1>
        <div>Now your summer camp registration is finished!<br>
            Your children <strong>${form.firstName} </strong> has been registered to the summer camp! <br>
            [#if form.email??]
                <strong>{form.email}</strong> is the email address where the Confirmation email was sent.[#else]Please contact us immediately, if you did not provide us your contact information.
            [/#if]
        </div>
    </div>
</div>
</body>
</html>
