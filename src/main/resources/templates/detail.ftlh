[#ftl]
<!DOCTYPE html>
<html lang="cs">
<head>
    <meta charset="UTF-8">
    <title>Vizitkovník</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link rel="stylesheet" href="https://maxst.icons8.com/vue-static/landings/line-awesome/line-awesome/1.3.0/css/line-awesome.min.css">
    <link rel="stylesheet" href="/css/style.css">
    <link rel="icon" type="image/png" href="/images/favicon.png">
</head>
<body>
<div class="detail">
    <div class="vizitka">
        <div class="jmeno">${kontakt.jmeno}</div>
        <div class="firma">${kontakt.firma}</div>
        <div class="udaje">
            <div class="adresa">
                <div>${kontakt.adresa.ulice} ${kontakt.adresa.cisloPopisne}</div>
                <div><span>${kontakt.adresa.psc}</span> Praha 1</div>
            </div>
            <div class="kontakty">
                [#if kontakt.email??]<div><i class="las la-at"></i> <span>${kontakt.email}</span></div>[/#if]
                [#if kontakt.telefon??]<div><i class="las la-phone-alt"></i> <span>${kontakt.telefon}</span></div>[/#if]
                [#if kontakt.web??]<div><i class="las la-globe"></i> <span>${kontakt.web}</span></div>[/#if]
            </div>
        </div>
    </div>

    <div class="mapa">
        <iframe style="border:none" src="https://frame.mapy.cz/?q=${(kontakt.adresa.ulice +", "+ kontakt.adresa.cisloPopisne)?url('UTF-8')}" width="100%" height="100%" frameborder="0"></iframe>
    </div>

</div>
</body>
</html>
