Git - good practices

* commit powinien miec dobry opis
* commit powinen miec jedna zmiane
* zmiana opisu tylko dla ostatiego commita (amend)
* podrozuj po histori i branchach tylko przy czystym dzrzewie roboczym
* usuwanie branchy  
    * zmergowany branch mozna usunac
    * nie powinnismy usuwac nie zmergowanych branch'y bo nie bedziemy wstanie wrocic do nich
    * nie usuwamy branchy na ktorych sie znajdujemy
* git flow - w skrocie
    * master - branch release-owy
    * develop - branch developerski
    * feature branch - branch do rozwoju funkcjonalnosci
    * feature branch - powinien startowac od developa i do niego finalnie zostac zmergowany


Git - przydatne komendy
git status
git add .
git commit -m "[tag] - message"
git restore --staged file-name// zdejmij ze stage'a
git checkout branch-name // przelacz sie na branch-name
git checkout -b branch-name // przelacz na nowo utworzony branch
git log --graph // rysujegraf historii w konsoli
