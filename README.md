# فرم نظرسنجی  

این فرم نظرسنجی برای دریافت بازخورد کاربران در مورد نرم‌افزار ما طراحی شده است.  
فرم شامل ۴ پنل است:  

1. کلاس main  
   در این کلاس، نام فرم و دکمه شروع قرار دارد. با کلیک روی دکمه، یک آبجکت از کلاس مربوط به صفحه بعدی ایجاد شده و از طریق اکشن لیسنر، متد مشخصی اجرا می‌شود.  
   در این متد، ابتدا یک آبجکت از کلاس جدید ساخته شده، سپس پنل فعلی حذف و پنل جدید به فریم اضافه می‌شود.  

2. کلاس informationPage  
   در این کلاس، اطلاعات شخصی مانند نام، سن، ایمیل و میزان آشنایی با برنامه‌های مشابه از کاربر درخواست می‌شود.  
   دکمه "Next page" عملکردی مشابه دکمه صفحه قبل دارد و پس از کلیک، پنل بعدی جایگزین پنل فعلی می‌شود.  

3. کلاس questionsPage  
   این کلاس شامل سوالاتی درباره طراحی و ظاهر برنامه است.  
   مانند مراحل قبلی، دکمه "Next page" پنل فعلی را حذف کرده و پنل جدید را به فریم اضافه می‌کند.  

4. کلاس thankYouPage  
   در این کلاس، پیام "Thanks for your participation!" برای تشکر از کاربر نمایش داده می‌شود.  


## سیر ایجاد تغییرات در پروژه به‌صورت تیمی  

عضو اول ([@farazcodeX](https://github.com/farazcodeX))  
   - ابتدا پروژه کلون شده و دو برنچ از main ایجاد شد.  
   - در هر برنچ، تغییرات موردنظر اعمال و سپس کامیت شد.  
   - در نهایت، دو برنچ (change-font و change-language) با main مرج شده و پروژه نهایی پوش شد.  

عضو دوم ([@amirparsaro](https://github.com/amirparsaro))  
   - پروژه کلون شده و برنچ theme-creation برای ایجاد تغییرات ظاهری ساخته شد.  
   - تغییرات مربوط به layout شامل BorderLayout برای صفحات اول و آخر و BoxLayout برای صفحات دوم و سوم انجام شد.  
   - تغییرات مربوط به رنگ صفحات و چینش متن‌ها (قرارگیری در وسط صفحه) اعمال شد.  
   - در نهایت، theme-creation با main مرج شد و پس از رفع کانفلیکت‌ها، پروژه نهایی پوش شد.  
