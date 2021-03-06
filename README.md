# questionnaire-app
研究用アンケート作成

* 概要

不特定多数の被験者が既存のアンケートをweb上で受けられるページをHeroku上で作成。誰がどの様にアンケートに回答したのかを管理出来るように、簡易的なログイン機能を実装（認証機能ではない）。スムーズに分析に取り組めるように、csvによる出力・設問登録が可能な管理画面を作成。問題内容はcsvに記入し、設問登録によってDBに書き込まれる。

[questionnaire-app](https://q-you-app.herokuapp.com/)

* 備考

研究の引き継ぎなどを考慮して、列挙型の使用やクラスの細分化。フロントでは、設問の回答方法であるラジオボタンをテーブルで表示し、広範囲で選択ができるように。当アンケートは定期的に行う想定であり、スマホからのアクセスが想定されるためレスポンシブにも対応。

* 環境
  * Herokuで公開
  * Play 2.4.6（ORマッパー Ebean）
  * PostgreSQL
* フレームワーク
  * Play Framework (Play Java)
  * BootStrap(CSS)
* ライブラリ
  * jQuery
  * OpenCSV
* 言語
  * Java + (Scala)
  * JavaScript
  * HTML5, CSS
