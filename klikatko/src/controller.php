<?php

function stripper($string) {
    return strip_tags(addslashes(trim($string)));
}

if (!empty($_SERVER['HTTP_CLIENT_IP'])) {
    $ip = $_SERVER['HTTP_CLIENT_IP'];
} elseif (!empty($_SERVER['HTTP_X_FORWARDED_FOR'])) {
    $ip = $_SERVER['HTTP_X_FORWARDED_FOR'];
} else {
    $ip = $_SERVER['REMOTE_ADDR'];
}

$created = time();
$type = stripper($_POST["type"]) ? 1 : 0;
$first_time = stripper($_POST["first_time"])  ?: 0;
$second_time = stripper($_POST["second_time"]) ?: 0;
$third_time = stripper($_POST["third_time"]) ?: 0;
$forth_time = stripper($_POST["forth_time"]) ?: 0;
$fifth_time = stripper($_POST["fifth_time"]) ?: 0;

$link = mysql_connect('host', 'user', 'password');
if (!$link) {
    die('Internal error.');
}
mysql_select_db('db_name', $link);
$query = sprintf("INSERT INTO zaznam VALUES('', '%s', %d, %s, %s, %s, %s, %s, %s)",
    mysql_real_escape_string($ip),
    mysql_real_escape_string($created),
    mysql_real_escape_string($type),
    mysql_real_escape_string($first_time),
    mysql_real_escape_string($second_time),
    mysql_real_escape_string($third_time),
    mysql_real_escape_string($forth_time),
    mysql_real_escape_string($fifth_time));
mysql_query($query);
mysql_close($link);

header("Location: http://klikatko.ondrejkrejcir.cz/thanks.html");