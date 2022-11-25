  
function validate() {
       
    if( document.form1.rno.value.length > 4 ) {
       alert( "Pleas enter 4 char roll no" );
       document.form1.rno.focus() ;
       return false;
    }
    

    if( document.form1.pno.value.length > 4 ) {
        alert( "Phone no is to long " );
        document.form1.pno.focus() ;
        return false;
     }

     if( document.form1.ads.value.length > 100 ) {
        alert( "name is to long" );
        document.form1.ads.focus() ;
        return false;
     }
   
    return( true );
 }


function validate1() {
      
    if( document.form2.rno.value.length > 4 ) {
       alert( "Pleas enter 4 char roll no" );
       document.form1.rno.focus() ;
       return false;
    }

    if( document.form2.pno.value.length > 4 ) {
        alert( "Phone no is to long " );
        document.form1.pno.focus() ;
        return false;
     }

     if( document.form2.ads.value.length > 100 ) {
        alert( "name is to long" );
        document.form1.ads.focus() ;
        return false;
     }
   
    return( true );
 }

