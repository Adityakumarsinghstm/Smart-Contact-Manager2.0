console.log("Script loaded...")

let currentTheme = getTheme();

document.addEventListener("DOMContentLoaded",()=>{
    changeTheme()
})



function changeTheme(){
    changePageTheme(currentTheme,currentTheme);
    console.log(currentTheme)
    document.querySelector("html").classList.add(currentTheme);

    //Adding a listner
    const changeThemeButton = document.querySelector('#theme_change_button');
    changeThemeButton.querySelector('span').textContent =currentTheme == "light"?" Dark":" Light";
    oldTheme = currentTheme;
    changeThemeButton.addEventListener("click",(event)=>{
        console.log("Change theme button clicked....");
        //const oldTheme = currentTheme;
        if(currentTheme == "dark")
        {
            currentTheme = "light";
        }
        else{
            currentTheme = "dark";
        }
        changePageTheme(currentTheme,oldTheme);
    })
}

function setTheme(theme)
{
    localStorage.setItem("theme",theme);
}

function getTheme()
{
    let theme = localStorage.getItem("theme");
    return theme ? theme :"light";
}

function changePageTheme(theme,oldTheme)
{
        setTheme(currentTheme);
        document.querySelector('html').classList.remove(oldTheme);
        document.querySelector('html').classList.add(theme);

        document.querySelector('#theme_change_button').querySelector('span').textContent =theme == "light"?" Dark":" Light";
}