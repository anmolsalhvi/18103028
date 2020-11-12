<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<pre>
<script>
    // var n = prompt("number of rows in the christmas tree?", "8");
    var n = 4;
    
    if(n<3){
        document.write("Too small")
    }
    else if(n<=5){
        christmasTree(n);
        
        for(a=1; a<=2; a++)
        {
            for(b=0; b<(n*2-4)/2; b++)
            {
                document.write(" ")
            }
            for(b=0;b<=2;b++)
            {
            document.write("0");
            }
            document.write("<br>");
        }
    }
    else{
        christmasTree(n);
        tree(n);
        
    }
    
    function christmasTree(n) {
        for(i=1; i<=n; i++)
        { 
            for(j=i; j<n; j++)
            {
                document.write(" ");
            }
            for(j=1; j<=(2*i-1); j++)
            {
                if(i==1){
                    document.write("*");
                }
                else{
                document.write("0");
                }
            }
        
            document.write("<br>");
        }
    }

    function tree(n) {
        for(a=1; a<=3; a++)
        {
            for(b=0; b<=(n*2-5)/2; b++)
            {
                document.write(" ")
            }
            for(b=0;b<=2;b++)
            {
            document.write("0");
            }
            document.write("<br>");
        }
    }

</script>
</pre>
</body>
</html>
