# pbj-iris-shadowfix (Forge 1.20.1) — GitHub Actions で自動ビルド

ローカルに JDK を入れずに、GitHub Actions 上で Java 17 + 管理Gradle を使って自動ビルドします。

## 使い方
1. このリポジトリ内容を GitHub にアップロード（新規Repoを作成し、全ファイルをPush）。
2. Push 後、Actions タブに `Build` ワークフローが走ります（数分）。
3. 完了後、`Artifacts` から `pbj-iris-shadowfix-jar` をダウンロード。
   中に `build/libs/pbj-iris-shadowfix-1.0.0.jar` が入っています。
4. そのJARをクライアントの `mods/` に配置して起動。

## 補足
- Forge: 1.20.1-47.4.1
- Java: 17（Actionsで自動インストール）
- Gradle: ランナー側で管理（wrapper不要）
