[#ftl]
[#import "/spring.ftl" as spring]
<!DOCTYPE html>
<html lang="cs">
<head>
    <meta charset="UTF-8">
    <title>Registration for summer children´s camp</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" type="image/png" href="/images/favicon.png">
    <link rel="stylesheet" href="/css/style.css"/>
</head>
<body>
<main>
    <div class="container">
        <form action="/" method="post">
            <h1>Registration for summer children´s camp</h1>

            <label for="firstName" class="radek">First Name</label>
            [@spring.formInput path="form.firstName" /]
            <div class="error">[@spring.showErrors "<br>"/]</div>

            <label for="lastName" class="radek">Last name:</label>
            [@spring.formInput path="form.lastName" /]
            <div class="error">[@spring.showErrors "<br>"/]</div>

            <label for="birthDate" class="radek">Birthdate:</label>
            [@spring.formInput path="form.birthDate" fieldType="date"/]
            <div class="error">[@spring.showErrors "<br>"/]</div>

            <div class="radek">Gender:</div>
            <div class="group">
                <div>
                    <input id="gender" type="radio" name="gender" value="male"/>
                    <label for="gender">Male</label>
                </div>
                <div>
                    <input id="gender" type="radio" name="gender" value="female"/>

                    <label for="gender">Female</label>
                </div>
            </div>
            [@spring.bind "form.gender"/]
            <div class="error">[@spring.showErrors "<br>"/]</div>

            <label for="tour">Tour:</label>
            [@spring.formSingleSelect path="form.tour" options={
            "": "",
            "1": "Tour_1 (5.7. - 11.7.)",
            "2": "Tour_2 (12.7. - 18.7.)",
            "3": "Tour_3 (19.7. - 25.7.)"
            } /]
            <div class="error">[@spring.showErrors "<br>"/]</div>

            <label for="email">E-mail:</label>
            [@spring.formInput path="form.email" fieldType="email"/]
            <div class="error">[@spring.showErrors "<br>"/]</div>

            <label for="phoneNumber">Phone Number:</label>
            [@spring.formInput path="form.phoneNumber"  /]
            <div class="error">[@spring.showErrors "<br>"/]</div>

            <div class="radek controls">
                <button type="submit">Register</button>
            </div>
        </form>
    </div>
</main>
</body>
</html>

