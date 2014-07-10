# HEB-ÉSI DEV1-LGJ – Développement, langage Java

Slides et matériel pour le cours de langage Java du premier quadrimestre en BAC1 à l'ÉSI, [HEB-ÉSI](http://www.heb.be/esi)


**Avertissement. Ces slides sont en construction**


## Contribuer

Avant de contribuer, on peut simplement dire merci si l'on utilise les slides.
Il est relativement facile également d'ouvrir une *issue* pour signaler une
erreur de typo ou une source flagrante d'incompréhension … ou tout autre « *bug* ». 


### Structure  
Si l'on veut participer à la rédaction des slides ou les faire évoluer, voici la
structure des  fichiers LaTeX: 

* Pour la version couleur :
    * java1-presentation.tex
    * java1-presentation-common.tex
    * java.sty
    * toc.tex
    * chapter*.tex

* Pour la version N/B :
    *	java1-presentation-print.tex
    *	//... idem version couleur

* Les images sont dans le dossier *img*

Pour contribuer à une leçon, il vous suffit d'éditer le fichier `chapitre*.tex` correspondant


### Dépendances  
Pour pouvoir créer les slides, outre *LaTeX*, vous aurez besoin des outils suivants :

* make
* rubber
* pdfnup
* la classe Prosper 
* @TODO : indiquer les packages LaTeX nécessaires
    * texlive-latex-recommended
    * texlive-lang-french
    * texlive-font-utils texlive-fonts-extra texlive-fonts-recommended

### Création des slides
Les slides sont créés via un *Makefile*

* `make clean` : efface les fichiers temporaires et les PDF
* `make chapter` (défaut) : crée les PDF pour chaque leçon (un répertoire
  "build" doit exister, le créer si necessaire)
* `make all` : crée en plus le PDF complet en couleur et en N/B pour l'impression


## Remarques

- Les fichiers .tex et .sty sont en latin1 car en utf8, le package listings pose des problèmes (accents non reconnus)


(TODO : vérifier si c'est toujours le cas)

##Contacts  
Marco Codutti <mcodutti@heb.be>  
Pierre Bettens <pbettens@heb.be>



[![CC](cc-by-nc-sa-80x15.png)](http://creativecommons.org/licenses/by-nc-sa/4.0/deed.fr)

