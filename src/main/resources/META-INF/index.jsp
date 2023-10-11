<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>Bienvenu</h1>
<p> Veuillez entrer votre nom d'utilisateur et votre mot de passe</p>
<a href="/hello" >hello</a>

<form method="post" action="/hello">
    <input type="text" name="nom">

    <input type="text" name="prénom">

    <input type="text" name="mot_de_passe">

    <input type="text" name="e_mail">
    <input type="submit" value="ajouter">

</form>
</body>
</html>