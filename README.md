#فرم نظرسنجی
 بطور کلی این یک فرم نظرسجی برای اخذ نظرات عموم درمورد نرم افزار ماست
 این فرم شامل 4 پنل است :  پنل شروع کع در مین قرار دارد این کلاس شامل یک دکمع است 
 کع با فشرده شدن آن آبجکتی از کلاس دیگر ایجاد میشود و با استفاده از ان تک متد موجود 
 در این کلاس صدا زده میشود
 And in that method an object of the mentioned class is created and our frame is passed to that method. In that class first the panel is created then our current panel is removed and the new panel is added to the frame.
 In my opinion, this method is not very interesting. My suggestion is to define our object outside the action listener of the start button and also use the constructor of the information-page class for dependency injection. Also, the information-page class would inherit from Jpanel so that instead of defining the panel, we would effectively use the class itself.
ساختار بقیه کلاس هاهم اینگونع است و همگی انها از معماری یکسانی برخودارند 

#team work :
تغییراتی که ایجاد شد : عضو اول *بنده ابتدا کلون کردم سپس 2 برنچ از برنچ مستر ساختم
در هرکدام تغییرات خاص خودشونو ایجاد کردم سپس کامیت کردم
در آخر نیز  2 برنچارو با برنچ مستر مرج کردم و پوش کردم تو گیت هااب
هم تیمی گرامی نیز تغییرات خود را ایجاد کرده و با مستر بندع که از پوش کردع بودم مرج کردند