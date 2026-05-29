# ☕ Java Design Patterns

Collection d'implémentations de **Design Patterns** en Java,
avec des exemples concrets et appliqués.

> Chaque pattern est isolé dans son propre dossier avec son contexte,
> son implémentation et un exemple d'utilisation réel.

---

## 📚 Patterns implémentés

### 🎨 Patterns Structuraux

| Pattern | Description | Exemple |
|---------|-------------|---------|
| [Decorator](./decorator/) | Ajouter des comportements dynamiquement à un objet | Gestion d'options dans une pizzeria |

### ⚙️ Patterns Comportementaux

| Pattern | Description | Exemple |
|---------|-------------|---------|
| [Strategy](./strategy/) | Changer d'algorithme à l'exécution | Lecture de fichiers multi-OS |

---

## 🔜 À venir

- **Observer** — système de notifications
- **Factory Method** — création d'objets sans exposer la logique
- **Singleton** — instance unique d'une classe
- **Builder** — construction d'objets complexes étape par étape
- **Adapter** — faire communiquer des interfaces incompatibles

---

## 💡 Lien avec la production

Ces patterns ne sont pas que théoriques — je les utilise en production :

- **Strategy** → routage SMS entre opérateurs télécom
(Orange CI, MTN CI) chez AWDPAY
- **Decorator** → middleware NestJS (auth, logging, validation)
- **Adapter** → abstraction des APIs de paiement régionales
(PayDunya, Mobile Money)

---

## 🚀 Lancer un projet

**Prérequis :** Java 8+

```bash
# Exemple avec le pattern Decorator
cd decorator
javac src/*.java -d out/
java -cp out Main
```

---

## 👨🏾‍💻 Auteur

**Evans Nzati** — [linkedin.com/in/evansnzati](https://linkedin.com/in/evansnzati)
Étudiant en Master 2 Génie Logiciel · ESGIS Gabon
